//运行类(FirtHospital)
package hospital_pack;
import hospital_pack.intermedic.InternalMedicine;//导入InternalMedicine类
import hospital_pack.surgdepart.SurgicalDepartment;//导入SurgicalDepartment类
public class FirstHospital{
	public static void main(String args[]){
		Hospital hos = new InternalMedicine();
		Hospital hos1 = new SurgicalDepartment();
		System. out. println("医院名称："+Hos.name);
		System. out. println("医院地址："+Hos1.addr);
		hos.department();
		hos1.department();
	}
}