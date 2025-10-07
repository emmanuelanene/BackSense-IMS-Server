package com.emmanuelanene.BackSense.services;

import com.emmanuelanene.BackSense.dtos.CategoryDTO;
import com.emmanuelanene.BackSense.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
