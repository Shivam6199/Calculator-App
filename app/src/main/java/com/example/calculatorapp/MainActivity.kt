package com.example.calculatorapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btAc.setOnClickListener {
            binding.tvEnter.text = " "
            binding.tvResult.text = " "
        }

        binding.seven.setOnClickListener {
            binding.tvEnter.append("7")
        }
        binding.eight.setOnClickListener {
            binding.tvEnter.append("8")
        }
        binding.nine.setOnClickListener {
            binding.tvEnter.append("9")
        }
        binding.four.setOnClickListener {
            binding.tvEnter.append("4")
        }
        binding.five.setOnClickListener {
            binding.tvEnter.append("5")
        }
        binding.six.setOnClickListener {
            binding.tvEnter.append("6")
        }
        binding.one.setOnClickListener {
            binding.tvEnter.append("1")
        }
        binding.two.setOnClickListener {
            binding.tvEnter.append("2")
        }
        binding.three.setOnClickListener {
            binding.tvEnter.append("3")
        }
        binding.dot.setOnClickListener {
            binding.tvEnter.append(".")
        }
        binding.zero.setOnClickListener {
            binding.tvEnter.append("0")
        }
        binding.plus.setOnClickListener {
            binding.tvEnter.append(" + ")
        }
        binding.sub.setOnClickListener {
            binding.tvEnter.append(" - ")
        }
        binding.btDiv.setOnClickListener {
            binding.tvEnter.append(" / ")
        }
        binding.x.setOnClickListener {
            binding.tvEnter.append(" * ")
        }
        binding.equal.setOnClickListener {
                val expression = ExpressionBuilder(binding.tvEnter.text.toString()).build()
                val result = expression.evaluate()
                val longResult = result.toLong()

                if (result == longResult.toDouble()) {

                    binding.tvResult.text = longResult.toString()

                } else {
                    binding.tvResult.text = result.toString()
                }
            }
        }
    }