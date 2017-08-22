package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.CategoryDao;
import com.dao.SupplierDao;
import com.model.Category;
import com.model.Supplier;


@Controller
public class Suppliercontroller {
	@Autowired
	private SupplierDao supplierDao;
	

	

	@RequestMapping(value="/addSupplier",method=RequestMethod.GET)
	public String listCategory(Model model)
	{ 
		
		
		List<Supplier> list=supplierDao.List();
		for(Supplier s:list)
		{
			System.out.println("address is" +s.getAddress());
		}
		model.addAttribute("supplier",new Supplier());
		model.addAttribute("listsupplier", list);
	
	
		return "addsupplier";
		
	}
	
	@RequestMapping(value="/newSupplier",method=RequestMethod.POST)
	public String addcategory(@ModelAttribute("supplier")  Supplier supplier)
	{

	

	if(supplier.getId()==0)
	{

		supplierDao.save(supplier);
	}
	else
	{
		supplierDao.update(supplier);
	}

	
	//  return "redirect:/categoryTable";
	  return "redirect:/AdminHome";
	}
	
	
	
	@RequestMapping(value="/editSupplier/{id}")
	public String editP(@ModelAttribute("id") int id,Model model)
	{
		model.addAttribute("Supplier", supplierDao.get(id));
		
		return "AdminHome";
	}
	
 
	@RequestMapping(value="/deleteSupplier/{id}")
	public String deleteCategory(@PathVariable("id") int id,Model model)
	{
		
		supplierDao.delete(id);
	   
		return "redirect:/AdminHome";
	}
 
	
	
	
	

}

