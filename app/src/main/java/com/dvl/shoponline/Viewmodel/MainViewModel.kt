package com.dvl.shoponline.Viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dvl.shoponline.Model.CategoryModel
import com.dvl.shoponline.Model.ItemsModel
import com.dvl.shoponline.Model.SliderModel
import com.dvl.shoponline.Respository.MainRespository

class MainViewModel ():ViewModel(){
    private val repository = MainRespository()
fun loadBanner():LiveData<MutableList<SliderModel>>{
    return repository.loadBanner()
}
    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }
    fun loadPopular():LiveData<MutableList<ItemsModel>>{
        return repository.loadPopular()
    }

}