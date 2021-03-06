package com.shijt.OAuth2.vo;

import com.shijt.OAuth2.commons.GlobalConsts;

import javax.persistence.*;

@Entity
@Table(name=GlobalConsts.tb_resource,schema = GlobalConsts.db_schema)
public class Resource extends BaseInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private long resourceId;

    public long getResourceId() {
        return resourceId;
    }

    public void setResourceId(long resourceId) {
        this.resourceId = resourceId;
    }

    private String url;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
