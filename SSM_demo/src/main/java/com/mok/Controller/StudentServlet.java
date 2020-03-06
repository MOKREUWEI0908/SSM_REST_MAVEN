package com.mok.Controller;

import com.mok.Component.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentServlet {

    @Autowired(required = false)
    public com.mok.Service.StudentServiceImpl studentServiceImpl;

    @RequestMapping(value ="/student/{age}",method= RequestMethod.GET)
    public ModelAndView selectLck(@PathVariable("age") Integer id){
        ModelAndView mv = new ModelAndView();
        Student stu = studentServiceImpl.findStudent(id);
        mv.setViewName("/success");
        mv.addObject("stu",stu);
        return mv;
    }

    /*@RequestMapping(value ="/student/{sid}",method=RequestMethod.DELETE)
    public ModelAndView selectLck(@PathVariable("sid")Integer id){
        ModelAndView mv = new ModelAndView();
        Student stu = studentServiceImpl.deleteStudent(id);
        mv.setViewName("/success");
        mv.addObject("stu",stu);
        return mv;
    }
     */

    /*@RequestMapping(value ="/student/{sid}",method=RequestMethod.PUT)
    public ModelAndView selectLck(@PathVariable("sid")Integer id){
        ModelAndView mv = new ModelAndView();
        Student stu = studentServiceImpl.updateStudent(id);
        mv.setViewName("/success");
        mv.addObject("stu",stu);
        return mv;
    }
     */
}
