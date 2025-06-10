package demo18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {

            String connectionString = "jdbc:mysql://localhost:3306/t2409m_jp";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString, username, password);
            System.out.println("Connected to database");
            Statement stt = conn.createStatement();
            String sql = "select * from students";

            Statement stmt = conn.createStatement();

            while (true) {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Sửa sinh viên");
                System.out.println("2. Xoá sinh viên");
                System.out.println("0. Thoát");
                System.out.print("Chọn: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.print("Nhập ID cần sửa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE id = " + id);
                    if (!rs.next()) {
                        System.out.println("❌ Không tìm thấy sinh viên.");
                    } else {
                        System.out.println("Hiện tại: ID=" + rs.getInt("id") +
                                ", Tên=" + rs.getString("name") +
                                ", Tuổi=" + rs.getInt("age") +
                                ", SĐT=" + rs.getString("telephone"));

                        System.out.print("Tên mới: ");
                        String name = scanner.nextLine();
                        System.out.print("Tuổi mới: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("SĐT mới: ");
                        String phone = scanner.nextLine();

                        String sqlUpdate = "UPDATE students SET name='" + name +
                                "', age=" + age +
                                ", telephone='" + phone +
                                "' WHERE id=" + id;
                        int result = stmt.executeUpdate(sqlUpdate);
                        System.out.println(result > 0 ? "✅ Cập nhật thành công." : "❌ Thất bại.");
                    }
                } else if (choice == 2) {
                    System.out.print("Nhập ID cần xoá: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE id = " + id);
                    if (!rs.next()) {
                        System.out.println("❌ Không tìm thấy sinh viên.");
                    } else {
                        System.out.println("Xác nhận xoá sinh viên: ID=" + rs.getInt("id") +
                                ", Tên=" + rs.getString("name"));
                        System.out.print("Nhập 'OK' để xoá: ");
                        String confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("OK")) {
                            int result = stmt.executeUpdate("DELETE FROM students WHERE id = " + id);
                            System.out.println(result > 0 ? "✅ Đã xoá." : "❌ Không xoá được.");
                        } else {
                            System.out.println("Đã huỷ.");
                        }
                    }
                } else if (choice == 0) {
                    System.out.println("👋 Thoát.");
                    break;
                } else {
                    System.out.println("❗ Lựa chọn không hợp lệ.");
                }
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}