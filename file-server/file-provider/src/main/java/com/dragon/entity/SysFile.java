package com.dragon.entity;

import lombok.Data;

@Data
public class SysFile {

  private long fileId;
  private long fsId;
  private String name;
  private String fileName;
  private String url;
  private String extension;
  private java.sql.Date createDate;


  public long getFileId() {
    return fileId;
  }

  public void setFileId(long fileId) {
    this.fileId = fileId;
  }


  public long getFsId() {
    return fsId;
  }

  public void setFsId(long fsId) {
    this.fsId = fsId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public java.sql.Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Date createDate) {
    this.createDate = createDate;
  }

}
