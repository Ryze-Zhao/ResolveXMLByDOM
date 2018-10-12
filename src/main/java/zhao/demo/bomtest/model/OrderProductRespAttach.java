package zhao.demo.bomtest.model;

import java.io.Serializable;

/**
 * 接口响应的附件信息
 * @author sumphone@papatang.org
 * @since 0.0.1 2018-06-06
 */
public class OrderProductRespAttach implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7731640746675204162L;
	
	private String id;
	/**
	 * 文件存储绝对全路径，包括路径与文件名，格式如: C:/files/mall/20180710/BOM8c2769b1adfe4dc88ae9ea66e32ef3fe
	 */
	private String filePath;
	/**
	 * 文件的真实名称，格式如：子母玻璃门的玻璃花色与型号不对应bom.xml
	 */
	private String fileName;
	/**
	 * 文件大小
	 */
	private Long size;


	public OrderProductRespAttach() {
		super();
	}
	public OrderProductRespAttach(String filePath,String fileName) {
		super();
		this.filePath = filePath;
		this.fileName = fileName;
	}

	public OrderProductRespAttach(String id, String filePath, String fileName, Long size) {
		super();
		this.id = id;
		this.filePath = filePath;
		this.fileName = fileName;
		this.size = size;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	
}
