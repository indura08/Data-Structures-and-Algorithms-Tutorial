public class Student {
    int studentId;
    String name;
    double gpa;

    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }
}

class TreeNode {
    Student student;
    TreeNode left;
    TreeNode right;

    public TreeNode(Student student) {
        this.student = student;
        this.left = null;
        this.right = null;
    }
}

class StudentBST {
    private TreeNode root;

    public StudentBST() {
        this.root = null;
    }

    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private TreeNode insertRec(TreeNode root, Student student) {
        if (root == null) {
            return new TreeNode(student);
        }

        if (student.studentId < root.student.studentId) {
            root.left = insertRec(root.left, student);
        } else if (student.studentId > root.student.studentId) {
            root.right = insertRec(root.right, student);
        }

        return root;
    }

    public Student search(int studentId) {
        return searchRec(root, studentId);
    }

    private Student searchRec(TreeNode root, int studentId) {
        if (root == null || root.student.studentId == studentId) {
            return (root != null) ? root.student : null;
        }

        if (studentId < root.student.studentId) {
            return searchRec(root.left, studentId);
        } else {
            return searchRec(root.right, studentId);
        }
    }

    public void delete(int studentId) {
        root = deleteRec(root, studentId);
    }

    private TreeNode deleteRec(TreeNode root, int studentId) {
        if (root == null) {
            return null;
        }

        if (studentId < root.student.studentId) {
            root.left = deleteRec(root.left, studentId);
        } else if (studentId > root.student.studentId) {
            root.right = deleteRec(root.right, studentId);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.student = findMin(root.right).student;
            root.right = deleteRec(root.right, root.student.studentId);
        }

        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void updateGPA(int studentId, double newGPA) {
        Student student = search(studentId);
        if (student != null) {
            student.gpa = newGPA;
        }
    }

    public double calculateAverageGPA() {
        double[] totalGPA = {0.0};
        int[] count = {0};
        calculateGPARec(root, totalGPA, count);
        return (count[0] > 0) ? totalGPA[0] / count[0] : 0.0;
    }

    private void calculateGPARec(TreeNode root, double[] totalGPA, int[] count) {
        if (root != null) {
            calculateGPARec(root.left, totalGPA, count);
            totalGPA[0] += root.student.gpa;
            count[0]++;
            calculateGPARec(root.right, totalGPA, count);
        }
    }

    public Student findHighestGPAStudent() {
        return (root != null) ? findHighestGPANode(root).student : null;
    }

    private TreeNode findHighestGPANode(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        StudentBST bst = new StudentBST();

        // Insert students
        bst.insert(new Student(101, "John Doe", 3.8));
        bst.insert(new Student(102, "Jane Smith", 3.9));
        bst.insert(new Student(103, "Bob Johnson", 3.5));

        // Search for a student
        Student result = bst.search(102);
        if (result != null) {
            System.out.println("Student found: " + result.name);
        }

        // Update GPA
        bst.updateGPA(101, 4.0);

        // Calculate average GPA
        double avgGPA = bst.calculateAverageGPA();
        System.out.println("Average GPA: " + avgGPA);

        // Find student with the highest GPA
        Student highestGPStudent = bst.findHighestGPAStudent();
        if (highestGPStudent != null) {
            System.out.println("Highest GPA student: " + highestGPStudent.name);
        }

        // Delete a student
        bst.delete(103);
    }
}