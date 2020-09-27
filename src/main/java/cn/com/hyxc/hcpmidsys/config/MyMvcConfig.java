package cn.com.hyxc.hcpmidsys.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年09月23日 17:03
 */
@Configuration//当前类是配置类
public class MyMvcConfig implements WebMvcConfigurer {

    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("lyl").setViewName("popupsignin");
        registry.addViewController("/").setViewName("popupsignin");
    }


}
