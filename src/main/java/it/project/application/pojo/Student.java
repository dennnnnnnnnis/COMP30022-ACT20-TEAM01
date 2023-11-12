/**
 * Class Name: Student
 * Description: Pojo for Student
 * 
 * Author: He Shen & Dennis Wang
 * Date: 2023/10/20
 */

package it.project.application.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("Student")
public class Student {
    @TableId("student_id")
    private Integer studentId;
    private String name;
    private String email;
    private boolean createRequest;
    private boolean deleteRequest;
    private boolean processRequest;
}