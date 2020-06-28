package com.yhh.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**  
 * <p>Description:mybatis 代码生成器 </p>  
 * @author yhh  
 * @date 2018年11月29日  
 */
public class CodeGenerator {
    
    private final static String URL = "jdbc:mysql://49.234.207.166:3306/yhh?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC";
    
    private final static String DRIVERNAME = "com.mysql.cj.jdbc.Driver";
    
    private final static String USERNAME = "root";
    
    private final static String PASSWORD = "yanghonghao";
    
    private final static String PREFIXPATH= "com.yhh.";
    
    private final static String AUTHOR = "yhh";
    
 /**
  * <p>
  * 读取控制台内容
  * </p>
  */
 public static String scanner(String tip) {
     @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
     StringBuilder help = new StringBuilder();
     help.append("请输入" + tip + "：");
     System.out.println(help.toString());
     if (scanner.hasNext()) {
         String ipt = scanner.next();
         if (StringUtils.isNotEmpty(ipt)) {
             return ipt;
         }
     }
     throw new MybatisPlusException("请输入正确的" + tip + "！");
 }

 public static void main(String[] args) {
     // 代码生成器
     AutoGenerator mpg = new AutoGenerator();

     // 全局配置
     GlobalConfig gc = new GlobalConfig();
     String projectPath = System.getProperty("user.dir");
     gc.setOutputDir(projectPath + "/src/main/java");
     gc.setAuthor(AUTHOR);
     gc.setOpen(false);
     mpg.setGlobalConfig(gc);

     // 数据源配置
     DataSourceConfig dsc = new DataSourceConfig();
     dsc.setUrl(URL);
     dsc.setDriverName(DRIVERNAME);
     dsc.setUsername(USERNAME);
     dsc.setPassword(PASSWORD);
     mpg.setDataSource(dsc);

     // 包配置
     PackageConfig pc = new PackageConfig();
     pc.setParent("");
     pc.setController(PREFIXPATH + "controller");
     pc.setService(PREFIXPATH + "service");
     pc.setServiceImpl(PREFIXPATH + "service.impl");
     pc.setMapper(PREFIXPATH + "mapper");
     pc.setEntity(PREFIXPATH + "entity");
     mpg.setPackageInfo(pc);

     // 自定义配置
     InjectionConfig cfg = new InjectionConfig() {
         @Override
         public void initMap() {
             // to do nothing
         }
     };
     List<FileOutConfig> focList = new ArrayList<>();
     focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
         @Override
         public String outputFile(TableInfo tableInfo) {
             // 自定义输入文件名称
             return projectPath + "/src/main/resources/mapper/" +
                     "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
         }
     });
     cfg.setFileOutConfigList(focList);
     mpg.setCfg(cfg);
     mpg.setTemplate(new TemplateConfig().setXml(null));

     // 策略配置
     StrategyConfig strategy = new StrategyConfig();
     strategy.setNaming(NamingStrategy.underline_to_camel);
     strategy.setColumnNaming(NamingStrategy.underline_to_camel);
     strategy.setEntityLombokModel(true);
     strategy.setRestControllerStyle(true);
     strategy.setInclude(scanner("表名"));
     strategy.setControllerMappingHyphenStyle(true);
     strategy.setTablePrefix(pc.getModuleName() + "_");
     mpg.setStrategy(strategy);
     mpg.setTemplateEngine(new FreemarkerTemplateEngine());
     mpg.execute();
 }

}
