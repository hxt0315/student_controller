package xyz.teikou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import xyz.teikou.entity.Grade;
import xyz.teikou.entity.User;
import xyz.teikou.service.GradeService;
import xyz.teikou.service.UserService;

import java.util.List;

/**
 * Creat by TeiKou
 * 2019/10/10 15:15
 * 教师端成绩管理
 */
@Controller
@RequestMapping("/teacher")
public class TGradeController {
    @Autowired
    GradeService gradeService;
    @Autowired
    UserService userService;

    @RequestMapping("/addGrade")
    public String addGrade(Grade grade) {
        gradeService.addGrade(grade);
        return "/success";
    }

    @RequestMapping("/insert")
    public ModelAndView insert() {
        ModelAndView mv = new ModelAndView("addGrade");
        List<User> allUser = userService.findAllUser();
        mv.addObject("schList", allUser);
        return mv;
    }

    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("allGrades");
        List<Grade> grades = gradeService.selectAllGrade();
        mv.addObject("grades", grades);
        return mv;
    }

    @RequestMapping("/oneGrade")
    public ModelAndView oneGrade(@RequestParam("schNumber") String schNumber) {
        ModelAndView mv = new ModelAndView();
        try {
            mv.setViewName("allGrades");
            List<Grade> grades = gradeService.seleOneGrade(schNumber);
            mv.addObject("grades", grades);
            return mv;
        } catch (Exception e) {
            mv.setViewName("error");
            return mv;
        }
    }

    @RequestMapping("/updateGrade")
    public ModelAndView updateGrade(@RequestParam("id") Integer id) {
        ModelAndView mv = new ModelAndView();
        try {
            Grade theGrade = gradeService.seleTheGrade(id);
            mv.setViewName("updateGrades");
            mv.addObject("grade", theGrade);
            return mv;
        } catch (Exception e) {
            mv.setViewName("error");
            return mv;
        }
    }

    @RequestMapping("/updateGrades")
    public String updateGrades(Grade grade) {
        gradeService.updateGrade(grade);
        return "success";
    }
}
