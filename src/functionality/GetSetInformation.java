package functionality;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ihorg
 */
public class GetSetInformation {
    private  static Integer rowCount,colCount,currentRow,currentId;

        public static void setCurrentId(Integer currentId) {
            GetSetInformation.currentId = currentId;
        }

        public static Integer getCurrentId() {
            return currentId;
        }
    
        public static void setRowCount(Integer rowCount) {
            GetSetInformation.rowCount = rowCount;
        }

        public static Integer getRowCount() {
            return rowCount;
        }
        public static void setColCount(Integer colCount) {
            GetSetInformation.colCount = colCount;
        }

        public static Integer getColCount() {
            return colCount;
        }
        
        public static void setCurrentRow(Integer currentRow) {
            GetSetInformation.currentRow = currentRow;
        }

        public static Integer getCurrentRow() {
            return currentRow;
        }
}
