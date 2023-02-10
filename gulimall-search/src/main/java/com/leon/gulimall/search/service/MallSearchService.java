package com.leon.gulimall.search.service;

import com.leon.gulimall.search.vo.SearchParam;
import com.leon.gulimall.search.vo.SearchResult;

public interface MallSearchService {
    SearchResult search(SearchParam param);
}
