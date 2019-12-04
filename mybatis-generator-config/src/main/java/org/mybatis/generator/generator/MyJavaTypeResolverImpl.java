package org.mybatis.generator.generator;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

public class MyJavaTypeResolverImpl extends JavaTypeResolverDefaultImpl {

    public MyJavaTypeResolverImpl() {
        super();
        // 数据库int 类型转换成java中的Long类型 默认Integer类型
        typeMap.put(Types.INTEGER, new JdbcTypeInformation("INTEGER", //$NON-NLS-1$
                new FullyQualifiedJavaType(Long.class.getName())));

        // 数据库中 tinyint 类型转换成java中的Integer类型 默认是Boolean类型
        // super.typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT", //$NON-NLS-1$
        //         new FullyQualifiedJavaType(Integer.class.getName())));
        // typeMap.put(Types.BIT, new JdbcTypeInformation("BIT", //$NON-NLS-1$
        //         new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
