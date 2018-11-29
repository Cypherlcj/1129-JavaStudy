/**  
 * @Title:  Produce.java   
 * @Package cn.edu360.javase24.day05.shopdemo   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CypherLCJ     
 * @date:   2018年11月29日 上午4:04:14   
 * @version V1.0 
 */  
package cn.edu360.javase24.day05.shopdemo;

/**   
 * @ClassName:  Produce   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Cypherlcj 
 * @date:   2018年11月29日 上午4:04:14   
 *     
 */
public class Product {
     private String productId;
     private String productName;
     private double price;
     private int num;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productId, String productName, double price, int num) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.num = num;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return  this.productId+","+this.productName+","+this.price+","+this.num;
	}
     
     
}
