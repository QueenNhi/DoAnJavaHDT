package DoAnHDT;

import java.sql.Connection;
import java.sql.SQLException;


public class main {

	public static void main(String[] args) throws SQLException{
		//tao ket noi den csdl tren may ao fedora sever 40
		Connection kncsdl = DBConnection.getInstance().getConnection();
		if(kncsdl != null) {
			System.out.println("ket noi toi may chu thanh cong");
		}else {
			System.out.println("loi ket noi");
		}
		}
}
