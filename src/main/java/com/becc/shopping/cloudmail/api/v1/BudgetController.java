package com.becc.shopping.cloudmail.api.v1;

import com.becc.shopping.cloudmail.database.IConnection;
import com.becc.shopping.cloudmail.sample.hero.Diana;
import com.becc.shopping.cloudmail.sample.hero.Hero;
import com.becc.shopping.cloudmail.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BudgetController {
    @Autowired
    private Hero yasuo;
    @Autowired
    private ShoppingService shoppingService;
    @Autowired
    private IConnection mysql;

    @RequestMapping(value = "/abc", method = RequestMethod.GET)
    @ResponseBody
    public String first() {
        mysql.createConnection();
        return yasuo.q();
    }
}
