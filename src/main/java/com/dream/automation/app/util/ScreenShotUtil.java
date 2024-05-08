package com.dream.automation.app.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import jakarta.annotation.PostConstruct;

@Lazy
@Component
public class ScreenShotUtil {

	@Autowired
	private TakesScreenshot takesScreenshot;
	@Autowired
	private TimeUtil timeUtil;

	@Value("${screenshot.filepath}")
	private String filepath;

//	@PostConstruct
//	private void init() {
//		for (int i = 0; i < 5; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("Sleeping......");
//		}
//	}

	public void takeScreenShot() throws IOException {
		File fileShot = this.takesScreenshot.getScreenshotAs(OutputType.FILE);
		String filepathName = this.filepath + "/img_shot_" + timeUtil.getCurrentDateTime() + ".png";
		Path pathFile = Path.of(filepathName);
		FileCopyUtils.copy(fileShot, pathFile.toFile());
	}

	public void takeScreenShot(String filepath) throws IOException {
		File fileShot = this.takesScreenshot.getScreenshotAs(OutputType.FILE);
		String filepathName = filepath + "/img_shot_" + timeUtil.getCurrentDateTime() + ".png";
		Path pathFile = Path.of(filepathName);
		FileCopyUtils.copy(fileShot, pathFile.toFile());
	}
}
