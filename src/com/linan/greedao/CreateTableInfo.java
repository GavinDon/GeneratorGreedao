
package com.linan.greedao;


import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class CreateTableInfo {
    public static void addEntity(Schema schema) {
        Entity entity = schema.addEntity(CreateTableInfo.class.getSimpleName());
        entity.addIdProperty().autoincrement();
        entity.addStringProperty(StudentsInfoModel.COLUMN_NAME).columnName(StudentsInfoModel.COLUMN_NAME);
        entity.addStringProperty(StudentsInfoModel.COLUMN_AGE).columnName(StudentsInfoModel.COLUMN_AGE);
        entity.addStringProperty(StudentsInfoModel.COLUMN_SEX).columnName(StudentsInfoModel.COLUMN_SEX);
    }
    public static void addNote(Schema schema) {
        Entity note = schema.addEntity("Note");
        note.addIdProperty();
        note.addStringProperty("text").notNull();
        note.addStringProperty("comment");
        note.addDateProperty("date");
 }
 
   
}
