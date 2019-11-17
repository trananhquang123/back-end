package com.example.filedemo.controller;

import java.util.List;

import com.example.filedemo.dto.dtoProduct;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseResource<T> {
	
	protected ResponseEntity<?> responseListData(List<T> dataList) {
		if (CollectionUtils.isEmpty(dataList)) {
			return new ResponseEntity<>(BaseResponse.success(null), HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(BaseResponse.success(dataList), HttpStatus.OK);
	}
	
	protected ResponseEntity<?> responseNoContent() {
		return new ResponseEntity<>(BaseResponse.success(null), HttpStatus.NO_CONTENT);
	}
	
	protected ResponseEntity<?> responseSuccess(T responseObject, String message) {
		return new ResponseEntity<>(BaseResponse.success(responseObject, message), HttpStatus.OK);
	}

	protected ResponseEntity<?> responseSuccess(dtoProduct dtoProduct, String message) {
		return new ResponseEntity<>(BaseResponse.success(dtoProduct, message), HttpStatus.OK);
	}
	protected ResponseEntity<?> responseSuccess( String message) {
		return new ResponseEntity<>(BaseResponse.success( message), HttpStatus.OK);
	}
	
	protected ResponseEntity<?> responseError(String message, HttpStatus status) {
		return new ResponseEntity<>(BaseResponse.error(message), status);
	}
}