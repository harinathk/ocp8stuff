package advancedclassdesign.enumdatatype;

public class EnumTest {
	
	PrinterType printerType;
	
	public EnumTest(PrinterType pType){
		printerType = pType;
	}
	
	public void feature(){
		//switch based on the printer type passed in the constructor
		switch(printerType){
		case DATAMATRIX:
			System.out.println("Data Matrix printer....");
			break;
		case INKJET:
			System.out.println("Inkjet Printer...");
			break;
		case LASER:
			System.out.println("Laser Printer....");
			break;
		}
	}
	public static void main(String []args){
		EnumTest enumTest = new EnumTest(PrinterType.INKJET);
		enumTest.feature();
	}
}
