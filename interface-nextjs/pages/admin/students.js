import React from "react";

// components
import TableStudents from "views/TableStudents.js";
import CardProfile from "components/Cards/CardProfile.js";

// layout for page
import Admin from "layouts/Admin.js";

// Call the API

export default function Settings() {
  return (
    <>
      <div className="flex flex-wrap">
        <div className="w-full lg:w-8/12 px-4">
          <TableStudents />
        </div>
        <div className="w-full lg:w-4/12 px-4">
          <CardProfile />
        </div>
      </div>
    </>
  );
}

Settings.layout = Admin;
