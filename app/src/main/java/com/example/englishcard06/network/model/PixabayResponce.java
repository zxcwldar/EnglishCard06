package com.example.englishcard06.network.model;

import com.example.englishcard06.network.model.Hits;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public class PixabayResponce {
    @SerializedName("total")
    private Integer total;
    @SerializedName("totalHits")
    private Integer totalHits;
    @SerializedName("hits")
    private List<Hits> hits = null;

    public Integer getTotal() {
        return total;
    }

    public Integer getTotalHits() {
        return totalHits;
    }

    public List<Hits> getHits() {
        return hits;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }

    public void setHits(List<Hits> hits) {
        this.hits = hits;
    }


}
