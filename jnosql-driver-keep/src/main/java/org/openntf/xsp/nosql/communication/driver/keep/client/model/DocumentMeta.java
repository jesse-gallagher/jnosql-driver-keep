/**
 * HCL Domino REST API basis
 * REST APIs for Domino and more done right. With declarative security and access to Code, Design and Data
 *
 * The version of the OpenAPI document: 1.0.8
 * Contact: HeyHCL@pnp-hcl.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openntf.xsp.nosql.communication.driver.keep.client.model;

import java.time.OffsetDateTime;
import jakarta.json.bind.annotation.JsonbCreator;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Meta data common to all Domino documents that are read-only with the exception of form
 **/

public class DocumentMeta {

  /**
   * 32 char universalId A-Z0-9, primary key unique across replicas
   **/
  @JsonbProperty("unid")
  private String unid;

  /**
   * Local (current NSF only) primary key of a document
   **/
  @JsonbProperty("noteid")
  private Integer noteid;

  /**
   * Date of document creation in ISO format
   **/
  @JsonbProperty("created")
  private OffsetDateTime created;

  /**
   * Last update date of a document
   **/
  @JsonbProperty("lastmodified")
  private OffsetDateTime lastmodified;

  /**
   * Last access date of a document
   **/
  @JsonbProperty("lastaccessed")
  private OffsetDateTime lastaccessed;

  /**
   * size in byte of a document or json result
   **/
  @JsonbProperty("size")
  private Integer size;

  /**
   * Is the document unread by the current user
   **/
  @JsonbProperty("unread")
  private Boolean unread;

  /**
   * Weak ETag of the current document
   **/
  @JsonbProperty("etag")
  private String etag;

  /**
   * This field records the current revision version of document. It's a 32-character hex-encoded
   * string of date. If db config \"requireRevisionToUpdate\" is enabled, then revision is required
   * when update document and only update document when revision version is right.
   **/
  @JsonbProperty("revision")
  private String revision;

  /**
   * Could the user who retrieved a document update it
   **/
  @JsonbProperty("isEditable")
  private Boolean isEditable;

  public DocumentMeta() {}

  @JsonbCreator
  public DocumentMeta(
      @JsonbProperty(value = "unid", nillable = true) String unid,
      @JsonbProperty(value = "noteid", nillable = true) Integer noteid,
      @JsonbProperty(value = "created", nillable = true) OffsetDateTime created,
      @JsonbProperty(value = "lastmodified", nillable = true) OffsetDateTime lastmodified,
      @JsonbProperty(value = "lastaccessed", nillable = true) OffsetDateTime lastaccessed,
      @JsonbProperty(value = "size", nillable = true) Integer size,
      @JsonbProperty(value = "unread", nillable = true) Boolean unread,
      @JsonbProperty(value = "etag", nillable = true) String etag) {
    this.unid = unid;
    this.noteid = noteid;
    this.created = created;
    this.lastmodified = lastmodified;
    this.lastaccessed = lastaccessed;
    this.size = size;
    this.unread = unread;
    this.etag = etag;
  }

  /**
   * 32 char universalId A-Z0-9, primary key unique across replicas
   * 
   * @return unid
   **/
  @Pattern(regexp = "[0-9A-F]*")
  @Size(min = 32, max = 32)
  public String getUnid() {
    return unid;
  }


  /**
   * Local (current NSF only) primary key of a document
   * 
   * @return noteid
   **/
  public Integer getNoteid() {
    return noteid;
  }


  /**
   * Date of document creation in ISO format
   * 
   * @return created
   **/
  public OffsetDateTime getCreated() {
    return created;
  }


  /**
   * Last update date of a document
   * 
   * @return lastmodified
   **/
  public OffsetDateTime getLastmodified() {
    return lastmodified;
  }


  /**
   * Last access date of a document
   * 
   * @return lastaccessed
   **/
  public OffsetDateTime getLastaccessed() {
    return lastaccessed;
  }


  /**
   * size in byte of a document or json result
   * 
   * @return size
   **/
  public Integer getSize() {
    return size;
  }


  /**
   * Is the document unread by the current user
   * 
   * @return unread
   **/
  public Boolean getUnread() {
    return unread;
  }


  /**
   * Weak ETag of the current document
   * 
   * @return etag
   **/
  public String getEtag() {
    return etag;
  }


  /**
   * This field records the current revision version of document. It&#39;s a 32-character
   * hex-encoded string of date. If db config \&quot;requireRevisionToUpdate\&quot; is enabled, then
   * revision is required when update document and only update document when revision version is
   * right.
   * 
   * @return revision
   **/
  public String getRevision() {
    return revision;
  }

  /**
   * Set revision
   **/
  public void setRevision(String revision) {
    this.revision = revision;
  }

  public DocumentMeta revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Could the user who retrieved a document update it
   * 
   * @return isEditable
   **/
  public Boolean getIsEditable() {
    return isEditable;
  }

  /**
   * Set isEditable
   **/
  public void setIsEditable(Boolean isEditable) {
    this.isEditable = isEditable;
  }

  public DocumentMeta isEditable(Boolean isEditable) {
    this.isEditable = isEditable;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentMeta {\n");

    sb.append("    unid: ").append(toIndentedString(unid)).append("\n");
    sb.append("    noteid: ").append(toIndentedString(noteid)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastmodified: ").append(toIndentedString(lastmodified)).append("\n");
    sb.append("    lastaccessed: ").append(toIndentedString(lastaccessed)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    isEditable: ").append(toIndentedString(isEditable)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

