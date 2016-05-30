
package com.linan.greedao;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Schema;
/**
 * 
 * @author linan
 * com.linan.greedao.dao 为src-gen目录下的生成文件目录包
 *
 */

public class GeneratorMain {
    public static void main(String[] args) throws Exception {
        String path = "../PublicBus/src-gen";
        if (args.length >= 1) {
            path = args[0];
        }
        Schema schema = new Schema(com.linan.greedao.Constants.DATABASE_VERSION,
                "com.stxx.greedao.dao");
        addAllSchema(schema);
        new DaoGenerator().generateAll(schema, path);
    }

    private static void addAllSchema(Schema schema) {
        CreateTableInfo.addEntity(schema);//表
        CreateTableInfo.addNote(schema);
    }
}