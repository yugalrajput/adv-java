package in.co.rays.Test;

import in.co.rays.Bean.MarksheetBean;
import in.co.rays.MarksheetModel.MarksheetModel;

public class MarksheetTest {
	public static void main(String[] args) {

		testAdd();
	}

	private static void testAdd() {
		// TODO Auto-generated method stub
		MarksheetBean bean = new MarksheetBean();
		MarksheetModel md = new MarksheetModel();
		bean.setId(15);
		bean.setRoll_no(115);
		bean.setFname("sapana");
		bean.setLname("singh");
		bean.setPhysics(99);
		bean.setChemistry(88);
		bean.setMaths(100);
		bean.setTotal(287);
		bean.setPercentage(96);

		try {
			MarksheetBean b = new MarksheetBean();
			b = md.add(bean);

			if (b != null) {
				System.out.println("sucess");
			}
		} 
		
		catch (Exception e) {
        System.out.println(e.getMessage());
		}

	}
}
