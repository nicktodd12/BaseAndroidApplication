package {{cookiecutter.package_name}}.R

{{cookiecutter.package_name}}.R

{{cookiecutter.package_name}}.activity

import android.os.Bundle

import dagger.android.support.DaggerAppCompatActivity
import {{cookiecutter.package_name}}.R

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}