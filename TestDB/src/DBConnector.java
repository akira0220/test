

import java.sql.DriverManager;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;


/**
 * <p> MySQL�ɐڑ�����ׂ̃��[�e�B���e�B�N���X�ł��B<br>
 *���[�g�A�J�E���g�ɂ�DB�ɐڑ�����܂�.</p>
 */

public class DBConnector {
/**
*JDBC JDBC �h���C�o�[��
*/
private static String driverName = "com.mysql.jdbc.Driver";
/**
* �f�[�^�x�[�X�ڑ� URL
*/
private static String url =
"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

/**
* �f�[�^�x�[�X�ڑ����[�U��
*/
private static String user = "root";
/**
* �f�[�^�x�[�X�ڑ��p�X���[�h
*/
private static String password = "mysql";
public Connection getConnection() {
Connection con = null;
try{
Class.forName(driverName);

con = (Connection) DriverManager.getConnection(url,user,password);
} catch (ClassNotFoundException e) {
e.printStackTrace() ;
} catch (SQLException e) {
e.printStackTrace() ;

}
return con ;

}
}
