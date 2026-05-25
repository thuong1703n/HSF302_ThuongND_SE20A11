package org.hsf302.gui;

import org.hsf302.configs.AppConfig;
import org.hsf302.pojo.Student;
import org.hsf302.sevices.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ManyToOne {

    public static void main(String[] args) {
        // Khởi tạo Spring Context từ file cấu hình AppConfig
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Lấy Bean StudentService ra để sử dụng
        StudentService myService = context.getBean(StudentService.class);

        // Tạo thử một đối tượng Student (Dùng Constructor có tham số của class Student)
        Student st = new Student(1,"Lam", "Nguyen", 8);

        // Gọi hàm save để kích hoạt AOP Log ngầm định
        myService.save(st);

        // Đóng context sau khi dùng xong (tùy chọn nhưng nên có)
        context.close();
    }
}