/**
 * Class Name: Request
 * Description: Pojo for Request
 * 
 * Author: Dennis Wang
 * Date: 2023/9/23
 */

package it.project.application.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@Data
@TableName("Request")
public class Request {
    // Database related
    @TableId("requestId") // Specify the primary key field
    private Integer requestId;
    private String description;
    private String status;
    private Date submissionDate;
    private Integer studentId;
    private String subjectId;
    private String requestType;
    private String taskType;
    private String requestName;

}