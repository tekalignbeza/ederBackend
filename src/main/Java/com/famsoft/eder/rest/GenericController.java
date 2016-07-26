package com.famsoft.eder.rest;

import com.famsoft.eder.application.GenericService;
import com.famsoft.eder.model.CoreEntity;
import com.famsoft.eder.model.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */


public class GenericController<E extends CoreEntity> {


    GenericService<E> genericService;

    public GenericController(GenericService<E> genericService) {
        this.genericService = genericService;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody String create(@RequestBody E entity){
        try{
            genericService.create(entity);
            return "success";
        }
        catch (Exception e){
            return null;
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody E get(@PathVariable("id") long id){
        try{
            E entity = genericService.get(id);
            return entity;
        }
        catch (Exception e){
            return null;
        }

    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody List<E> getAll(Model model) {
        try{
           return genericService.getAll();
        }
        catch (Exception e){
            return null;
        }
    }

    @RequestMapping("/remove/{id}")
    public @ResponseBody String remove(@PathVariable("id") long id){
        try{
            genericService.delete(id);
            return "success";
        }
        catch (Exception e){
            return null;
        }

    }

    @RequestMapping("/edit/{id}")
    public String editPerson(@RequestBody E entity){
        try{
            genericService.update(entity);
            return "success";
        }
        catch (Exception e){
            return null;
        }
    }
}
