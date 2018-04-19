package com.sankar;

public class Model {
	
	private String topic;
	@Override
	public String toString() {
		return "Model [topic=" + topic + ", filename=" + filename + "]";
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	private String filename;

}
