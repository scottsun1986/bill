package util;


import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import mybatis.dao.BillDetailMapper;
import mybatis.model.Prod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanGetter {
	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	public static Object getBean(String beanName) { 
		return ctx.getBean(beanName);
	}

	public static void main(String[] args) throws FileNotFoundException, SQLException {
	
	

	//	GridbuildingMapper fm=(GridbuildingMapper)BeanGetter.getBean("gridbuildingMapper");
		//System.out.println(((Gridbuilding)fm.selectAll()).getUdepartment());
	//	PageHelper.startPage(2,20);
		
//		Gridbuilding gb=new Gridbuilding();
//				gb.setAcceptTime(DateHelper.getCurrentYYYYMMDDHHMMSS());
//		gb.setHasAssess(true);
//		gb.setName("娴嬭瘯鍖哄煙2");
//		fm.insert(gb);
	
//	System.out.println(fm.selectByAll(null, "鑻忓畞鐜悆", null, null, null, null, null, null, null, null, null, null).size());
//	
//	List<Gridbuilding> t=fm.selectByAll(null, "鑻忓畞鐜悆", null, null, null, null, null, null, null, null, null, null);
//	System.out.println(t.get(0).getName());
//	System.out.println(t.get(1).getId());
//	
	
	
	BillDetailMapper cm=(BillDetailMapper)BeanGetter.getBean("billDetailMapper");
	//System.out.println(cm.selectByProdIdAndBillMonths("1", new String[]{"201504","201503"}).getBillList());
	
	String[] billMonthArray;

			billMonthArray=new String[]{getMonth(-1),getMonth(-2),getMonth(-3)};
	
	
			System.out.println(cm.selectByBillId(4).get(0).getSubBillDetailList().get(0).getBillConf().getBillItemName());
	 
	//	System.out.println(((Page)fm.selectAll()).getPageSize());
		
//List<VItem> news = im.getLatestItems(new Integer(101), 0, 10);
//System.out.println(news.size());
//		OmOrderManager f=(OmOrderManager)BeanGetter.getBean("OmOrderManager");
//		OmOrder s=(OmOrder)f.findByOrderCode("030").get(0);
//	System.out.println(s.getOmSoSla());
//	 ConfDAO sss=(ConfDAO)BeanGetter.getBean("ConfDAO");
//	 System.out.println(sss.findAll().size())
//	;
		
	}
public static  String getMonth(int ref) {
	Calendar rightNow = Calendar.getInstance();
	SimpleDateFormat fmt = new SimpleDateFormat("yyyyMM");
	rightNow.add(Calendar.MONTH, ref);

	// 格式大小写有区别
	String sysDatetime = fmt.format(rightNow.getTime());
	return sysDatetime;
}

}
