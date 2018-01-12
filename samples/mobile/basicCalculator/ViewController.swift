//
//  ViewController.swift
//  basicCalculator
//
//  Created by jetbrains on 01/12/2017.
//  Copyright © 2017 JetBrains. All rights reserved.
//

import UIKit
import KotlinSharedLib

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let calc = KSLBasicCalculator()
        input.text = "1+1=\(calc.plus(left: 1.0, right: 1.0))\n1-1=\(calc.minus(left: 1.0, right: 1.0))\n1*1=\(calc.mult(left: 1.0, right: 1.0))\n1\\1=\(calc.div(left: 1.0, right: 1.0))\n1 == \(calc.number(value: 1.0))"
    }

    @IBOutlet var input: UITextView!

}
