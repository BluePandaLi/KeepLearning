//
//  ViewController.swift
//  CoreAnimationDemo
//
//  Created by XinLi on 12/8/14.
//  Copyright (c) 2014 XinLi. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func Push(sender: UIButton) {
        
//        var action =  self.view.actionForLayer(self.view.layer, forKey: "position")
//        
//        println("outside animation block: \(action)")
        
//        UIView.animateWithDuration(0.3, animations: { () -> Void in
//            
//        self.view.layer.position = CGPoint(x: 0.0, y: 0.0)//
//          var action =  self.view.actionForLayer(self.view.layer, forKey: "position")
//            
//            println("inside animation block: \(action)")
//        })
        
        println("position : \(self.view.layer.position)")
        println("anchropoint: \(self.view.layer.anchorPoint)")
        //锚点
        self.view.layer.anchorPoint = CGPoint(x: 0.7, y: 0.7)
        
        println("position : \(self.view.layer.position)")
        println("anchropoint: \(self.view.layer.anchorPoint)")
        println("frame:\(self.view.frame)")
        println("bounds:\(self.view.bounds)")
    
    }

}

