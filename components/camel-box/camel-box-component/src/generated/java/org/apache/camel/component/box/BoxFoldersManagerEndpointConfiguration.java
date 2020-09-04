
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.box.api.BoxFoldersManager
 */
@ApiParams(apiName = "folders", apiMethods = "copy,create,link,delete,folder,info,items,root,move,rename,updateInfo")
@UriParams
@Configurer
public final class BoxFoldersManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam(description = "The access level of the shared link")
    private com.box.sdk.BoxSharedLink.Access access;
    @UriParam(description = "The id of the destination folder")
    private String destinationFolderId;
    @UriParam(description = "The information fields to retrieve; if")
    private String[] fields;
    @UriParam(description = "The id of folder to copy")
    private String folderId;
    @UriParam(description = "The name of created folder")
    private String folderName;
    @UriParam(description = "The updated information")
    private com.box.sdk.BoxFolder.Info info;
    @UriParam(description = "The maximum number of children to retrieve after the offset; if")
    private Long limit;
    @UriParam(description = "The new name of folder")
    private String newFolderName;
    @UriParam(description = "Is")
    private String newName;
    @UriParam(description = "The index of first child item to retrieve; if")
    private Long offset;
    @UriParam(description = "The id of parent folder")
    private String parentFolderId;
    @UriParam(description = "Sequence of Box folder names from parent folder to returned folder")
    private String[] path;
    @UriParam(description = "Is")
    private com.box.sdk.BoxSharedLink.Permissions permissions;
    @UriParam(description = "The date and time at which time the created shared link will expire; if")
    private java.util.Date unshareDate;

    public com.box.sdk.BoxSharedLink.Access getAccess() {
        return access;
    }

    public void setAccess(com.box.sdk.BoxSharedLink.Access access) {
        this.access = access;
    }

    public String getDestinationFolderId() {
        return destinationFolderId;
    }

    public void setDestinationFolderId(String destinationFolderId) {
        this.destinationFolderId = destinationFolderId;
    }

    public String[] getFields() {
        return fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public com.box.sdk.BoxFolder.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxFolder.Info info) {
        this.info = info;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public String getNewFolderName() {
        return newFolderName;
    }

    public void setNewFolderName(String newFolderName) {
        this.newFolderName = newFolderName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public String getParentFolderId() {
        return parentFolderId;
    }

    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public String[] getPath() {
        return path;
    }

    public void setPath(String[] path) {
        this.path = path;
    }

    public com.box.sdk.BoxSharedLink.Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(com.box.sdk.BoxSharedLink.Permissions permissions) {
        this.permissions = permissions;
    }

    public java.util.Date getUnshareDate() {
        return unshareDate;
    }

    public void setUnshareDate(java.util.Date unshareDate) {
        this.unshareDate = unshareDate;
    }
}
