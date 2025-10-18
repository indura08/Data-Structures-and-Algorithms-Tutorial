package AdjacencyList;

class Student {
    int id;
    String name;
    double gpa;
    Student left, right;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.left = this.right = null;
    }
}

class StudentManagementSystem {
    private Student root;

    public void insertStudent(int id, String name, double gpa) {
        root = insertStudent(root, id, name, gpa);
    }

    private Student insertStudent(Student root, int id, String name, double gpa) {
        if (root == null) {
            return new Student(id, name, gpa);
        }

        if (id < root.id) {
            root.left = insertStudent(root.left, id, name, gpa);
        } else if (id > root.id) {
            root.right = insertStudent(root.right, id, name, gpa);
        }

        return root;
    }

    public Student searchStudent(int id) {
        return searchStudent(root, id);
    }

    private Student searchStudent(Student root, int id) {
        if (root == null || root.id == id) {
            return root;
        }

        if (id < root.id) {
            return searchStudent(root.left, id);
        } else {
            return searchStudent(root.right, id);
        }
    }

    public void deleteStudent(int id) {
        root = deleteStudent(root, id);
    }

    private Student deleteStudent(Student root, int id) {
        if (root == null) {
            return null;
        }

        if (id < root.id) {
            root.left = deleteStudent(root.left, id);
        } else if (id > root.id) {
            root.right = deleteStudent(root.right, id);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.id = findMin(root.right).id;
            root.right = deleteStudent(root.right, root.id);
        }

        return root;
    }

    private Student findMin(Student node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void updateGPA(int id, double newGPA) {
        Student student = searchStudent(id);
        if (student != null) {
            student.gpa = newGPA;
        } else {
            System.err.println("Student with ID " + id + " not found.");
        }
    }

    public double calculateAverageGPA() {
        SumAndCount sumAndCount = calculateSumAndCount(root);
        if (sumAndCount.count == 0) {
            return 0;
        }
        return sumAndCount.sum / sumAndCount.count;
    }

    private SumAndCount calculateSumAndCount(Student root) {
        if (root == null) {
            return new SumAndCount(0, 0);
        }

        SumAndCount leftStats = calculateSumAndCount(root.left);
        SumAndCount rightStats = calculateSumAndCount(root.right);

        return new SumAndCount(leftStats.sum + rightStats.sum + root.gpa,
                leftStats.count + rightStats.count + 1);
    }

    public Student findStudentWithHighestGPA() {
        if (root == null) {
            return null;
        }
        Student currentNode = root;
        while (currentNode.right != null) {
            currentNode = currentNode.right;
        }
        return currentNode;
    }

    public static void main(String[] args) {
        StudentManagementSystem studentSystem = new StudentManagementSystem();

        // Insert students
        studentSystem.insertStudent(101, "Alice", 3.8);
        studentSystem.insertStudent(102, "Bob", 3.9);
        studentSystem.insertStudent(103, "Charlie", 3.5);
        studentSystem.insertStudent(104, "David", 4.0);

        // Search for a student
        Student student = studentSystem.searchStudent(102);
        System.out.println("Student found: " + student.name);

        // Delete a student
        studentSystem.deleteStudent(103);

        // Update GPA
        studentSystem.updateGPA(101, 4.2);

        // Calculate average GPA
        double averageGPA = studentSystem.calculateAverageGPA();
        System.out.println("Average GPA: " + averageGPA);

        // Find student with the highest GPA
        Student highestGPAStudent = studentSystem.findStudentWithHighestGPA();
        System.out.println("Student with the highest GPA: " + highestGPAStudent.name);
    }

    static class SumAndCount {
        double sum;
        int count;

        public SumAndCount(double sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }
}
