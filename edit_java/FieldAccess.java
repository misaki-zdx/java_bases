
/**
*@Author Misaki
事实证明只有普通方法的调用可以是多态的
*
*/
public class FieldAccess{
	public static void main(String[]args){
		SuperField supe = new SupField();
		System.out.println(supe.Field+"    "+supe.getField());
	}
}
class SuperField{
	public int Field = 0;
	public int getField(){
		return Field;
	}
}
class SupField extends SuperField{
	public int Field = 1;
	public int getField(){
		return Field;
	}
	public int getSuperField(){
		return super.Field;
	}
}