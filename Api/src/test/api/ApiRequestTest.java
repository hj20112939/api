package api;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * @author huangjian
 * 调用接口测试类
 */
public class ApiRequestTest {
  private void httpUrlConnection(){ 
  try {   
    String pathUrl = "http://192.168.107.227:8080/Api/CaptureProcess/NoticeCaptureDataSucceed/RequestTask.do";   
	// 建立连接   
	URL url = new URL(pathUrl);   
	HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();   
	// 设置连接属性   
	httpConn.setDoOutput(true);// 使用 URL 连接进行输出   
	httpConn.setDoInput(true);// 使用 URL 连接进行输入   
	httpConn.setUseCaches(false);// 忽略缓存   
	httpConn.setRequestMethod("POST");// 设置URL请求方法   NAME
	String requestString = "{data:[{\"RequestTarget\":\"AnjuKe\",\"RequestTaskId\":5," +
				"\"RequestData\":{\"申请城市\":\"北京\",\"小区名称\":\"家来庄园\"," +
				"\"楼号\":\"1\",\"朝向\":\"南北\"},\"ExtendField\":\"预留\"}]}";   
	// 设置请求属性   
	// 获得数据字节数据，请求数据流的编码，必须和下面服务器端处理请求流的编码一致   
	byte[] requestStringBytes = requestString.getBytes("utf-8");   
	httpConn.setRequestProperty("Content-length", "" + requestStringBytes.length);   
	httpConn.setRequestProperty("Content-Type", "application/json");   
	httpConn.setRequestProperty("Connection", "Keep-Alive");// 维持长连接   
	httpConn.setRequestProperty("Charset", "UTF-8");        
	// 建立输出流，并写入数据   
	OutputStream outputStream = httpConn.getOutputStream();   
	outputStream.write(requestStringBytes);   
	outputStream.close();   
	// 获得响应状态   
	int responseCode = httpConn.getResponseCode();   
	System.out.println(responseCode); 
	}catch (Exception ex){   
	  ex.printStackTrace();   
	}      
  }   
  public static void main(String args[]){
	ApiRequestTest test = new ApiRequestTest();
	test.httpUrlConnection();
  }
}
