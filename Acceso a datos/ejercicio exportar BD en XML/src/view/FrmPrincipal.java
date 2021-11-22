package view;

public class FrmPrincipal {

	public static void main(String[] args) throws Exception {
		
		for(String s : logic.LogTables.getTablas()) {
			System.out.println(s);
		}

	}

}
