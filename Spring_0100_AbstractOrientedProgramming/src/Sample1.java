import java.util.*;  
import org.jdom.*;  
import org.jdom.input.SAXBuilder;  
public class Sample1 {     
	public static void main(String[] args) throws Exception{       
		SAXBuilder sb=new SAXBuilder();       
		Document doc=sb.build("sample.xml"); //construct document object
		Element root=doc.getRootElement(); //get root element
		List list=root.getChildren("disk");// get all the elements with name disk     
		for(int i=0;i<list.size();i++){          
			Element element=(Element)list.get(i);          
			String name=element.getAttributeValue("name");          
			String capacity=element.getChildText("capacity");//get subelement of disk        
			String directories=element.getChildText("directories");         
			String files=element.getChildText("files");         
			System.out.println("磁盘信息:");          
			System.out.println("分区盘符:"+name);         
			System.out.println("分区容量:"+capacity);         
			System.out.println("目录数:"+directories);         
			System.out.println("文件数:"+files);          
			System.out.println("-----------------------------------");      
		}
	}  
} 
		