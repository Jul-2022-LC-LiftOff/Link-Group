package com.yourbookapp.bookapp.models.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SearchDTO {


    public String searchstring;

    public String getSearchString() {
        return searchstring;
    }

    public void setSearchString(String searchstring) {
        this.searchstring = searchstring;
    }

}




