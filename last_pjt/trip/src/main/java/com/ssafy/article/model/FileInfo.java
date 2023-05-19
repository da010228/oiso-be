package com.ssafy.article.model;

public class FileInfo {

	private String originName;
	private String onlinePath;
	private String deletePath;

	public FileInfo(String originName, String onlinePath, String deletePath) {
		super();
		this.originName = originName;
		this.onlinePath = onlinePath;
		this.deletePath = deletePath;
	}

	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	public String getOnlinePath() {
		return onlinePath;
	}
	public void setOnlinePath(String onlinePath) {
		this.onlinePath = onlinePath;
	}
	public String getDeletePath() {
		return deletePath;
	}
	public void setDeletePath(String deletePath) {
		this.deletePath = deletePath;
	}

	@Override
	public String toString() {
		return "FileInfo [originName=" + originName + ", onlinePath=" + onlinePath + ", deletePath=" + deletePath + "]";
	}


}
