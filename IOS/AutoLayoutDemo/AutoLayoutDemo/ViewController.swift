//
//  ViewController.swift
//  AutoLayoutDemo
//
//  Created by Xin Li on 11/26/14.
//  Copyright (c) 2014 Xin Li. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var EdgesView: UIView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        println(EdgesView)
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

