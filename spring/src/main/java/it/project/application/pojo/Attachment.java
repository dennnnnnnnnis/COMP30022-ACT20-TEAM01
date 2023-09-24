/**
 * Class Name: Attachment
 * Description: Pojo for Attachment
 * 
 * Author: Dennis Wang
 * Date: 2023/9/23
 */

package it.project.application.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Attachment")
public class Attachment {

    @TableId("attachmentId") // primary key
    private Integer attachmentId;
    private String url;
    private Integer requestId;

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }
}
