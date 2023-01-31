package in.co.rays.Marksheet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class MarksheetTest {

	private static ArrayList list;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// testAdd();
		//testMeritList();
		//testUpdate();
		//testDelete();
		testGet();
	}

	




	private static void testAdd() {
		//TODO Auto-generated method stub
		Bean b=new Bean();
		MarksheetModel md=new MarksheetModel();
		
		b.setRoll_no(4);
	b.setFname("vipin");
		b.setLname("sharma");
		b.setEmailid("vipins12@gmail.com");
		b.setPhysics(29);
		b.setChemistry(48);
		b.setMaths(33);
		
		try {
			//Bean b1=new Bean();
		md.add(b);
			
		
				System.out.println("sucess");
			
			
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

	
	private static void testMeritList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Bean b=new Bean();
		MarksheetModel md=new MarksheetModel();
		ArrayList al=new ArrayList();
		al=(ArrayList)md.meritList();
		System.out.println(al);
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			b=(Bean)it.next();
			System.out.println(b.getId()+"\t");
			System.out.println(b.getRoll_no()+"\t");
			System.out.println(b.getFname()+"\t");
			System.out.println(b.getLname()+"\t");
			System.out.println(b.getEmailid()+"\t");
			System.out.println(b.getPhysics()+"\t");
			System.out.println(b.getChemistry()+"\t");
			System.out.println(b.getMaths());
		}
	}

		private static void testUpdate() throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			
			Bean b=new Bean();
			MarksheetModel md=new MarksheetModel();
			b.setFname("sakshi");
			b.setLname("singh");
			b.setId(4);
			md.update(b);
			System.out.println("update");
		}

		private static void testDelete() throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Bean b=new Bean();
			MarksheetModel md=new MarksheetModel();
			b.setRoll_no(5);
			md.delete(b);
			System.out.println("Delete");
			
		}
		

		private static void testGet() throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			
			MarksheetModel md=new MarksheetModel();
			Bean b=new Bean();
			b.setRoll_no(3);
			
			try {
				Bean b1= new Bean();
			  b1=md.get(b);
			System.out.print(b1.getRoll_no()+"\t");
			System.out.print(b1.getFname()+"\t");
			System.out.print(b1.getLname()+"\t");
			System.out.print(b1.getEmailid()+"\t");
			System.out.print(b1.getPhysics()+"\t");
			System.out.print(b1.getChemistry()+"\t");
			System.out.println(b1.getMaths());
			
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}


