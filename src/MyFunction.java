
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;


public class MyFunction {
  
    public static int countData(String tableName) {
        
      int total=0;
        try {
             
        Connection conn = null;
     OraclePreparedStatement pst = null;
     OracleResultSet rs = null;
      conn = JavaConnectDb.connectrDb();
      String sql= "SELECT COUNT(*) AS total FROM   "+tableName;
           pst=(OraclePreparedStatement) conn.prepareStatement(sql);
             rs = (OracleResultSet) pst.executeQuery();
             while (rs.next()) {
                total=rs.getInt(1);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
    
        }
        return total;

        
    }
 
    
     
}
