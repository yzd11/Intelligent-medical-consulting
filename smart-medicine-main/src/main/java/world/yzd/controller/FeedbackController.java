package world.yzd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.yzd.entity.Feedback;


@RestController
@RequestMapping(value = "feedback")
public class FeedbackController extends BaseController<Feedback> {

}
