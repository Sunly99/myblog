package myblog.pojo.po.custom;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 孙柳烨
 * @date 2020/12/10
 */
@Data
public class TypeCustom {
    private Long id;
    private String name;

    private List<BlogCustom> blogs = new ArrayList<>();
}
