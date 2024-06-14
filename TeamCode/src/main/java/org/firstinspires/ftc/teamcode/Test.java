package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


public class Test extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        // initialize hardware

        DcMotor frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a) {
                frontLeft.setPower(1);
            }
        }
    }
}
