package com.xufavour.developer.app.controller;

import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.favour.developer.framework.mybatis.service.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/25
 */
@RestController
public class JikeController {

    @Resource
    private ArticleService articleService;

    @RequestMapping("/test")
    public void test() {
        String url = "https://time.geekbang.org/serv/v1/column/articles";
    }

    public static void main(String[] args) {
        String cookie = "gksskpitn=3859761a-dbf0-4a08-a165-bae9ba323822; _ga=GA1.2.2123936074.1590386209; LF_ID=1590386209171-3580659-1438163; _gid=GA1.2.2005203081.1593073369; Hm_lvt_59c4ff31a9ee6263811b23eb921a5083=1591334317,1591345907; GCID=e43291f-c27d51f-65fbc91-df2f4a2; GRID=e43291f-c27d51f-65fbc91-df2f4a2; GCESS=BQQEAC8NAAcE64o8gQkBAQsCBQAMAQECBP1f9F4FBAAAAAABCH4_HwAAAAAABgT8i0puAwT9X_ReCgQAAAAACAED; Hm_lvt_022f847c4e3acd44d4a2481d9187f1e6=1591933548,1593073402,1593073587,1593073681; Hm_lpvt_59c4ff31a9ee6263811b23eb921a5083=1593080238; Hm_lpvt_022f847c4e3acd44d4a2481d9187f1e6=1593080238; _gat=1; SERVERID=1fa1f330efedec1559b3abbcb6e30f50|1593080239|1593073367; gk_process_ev={%22referrer%22:%22https://time.geekbang.org/column/article/191452?gk_activity=0%22%2C%22target%22:%22page_course_article_detail%22%2C%22utime%22:1593080239715%2C%22count%22:2%2C%22referrerTarget%22:%22page_course_article_detail%22}";

        String url = "https://time.geekbang.org/serv/v1/column/articles";
        Map<String, String> params = new HashMap<>();
        params.put("cid", "254");
        params.put("order", "earliest");
        params.put("prev", "0");
        params.put("sample", "false");
        params.put("size", "100");

//        System.out.println(JsoupUtil.postHttp(url, params, cookie));
        readPic();
    }

    private static void readPic() {
        File jpegFile = new File("/Users/xyy/Documents/WechatIMG.jpeg");
        Metadata metadata;
        try {
            metadata = JpegMetadataReader.readMetadata(jpegFile);
            Iterator<Directory> it = metadata.getDirectories().iterator();
            while (it.hasNext()) {
                Directory exif = it.next();
                Iterator<Tag> tags = exif.getTags().iterator();
                while (tags.hasNext()) {
                    Tag tag = (Tag) tags.next();
                    System.out.println(tag);

                }

            }
        } catch (JpegProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
